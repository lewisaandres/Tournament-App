package com.mongodb.app

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.qrcode.QRCodeWriter

class QRCodeActivity : AppCompatActivity() {
    private lateinit var qrCodeView: ImageView
    private lateinit var generateQRButton: Button
    private lateinit var present: TextView

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.qrcode_view)
        qrCodeView = findViewById(R.id.qr_code)
        generateQRButton = findViewById(R.id.generate_qr)
        present = findViewById(R.id.presentText)
        // QR Code not displayed until clicking 'Generate' button
        generateQRButton.setOnClickListener {
            // Once tournament data is implemented, will link actual tournament
            qrCodeView.setImageBitmap(getQrCodeBitmap("Valorant Tournament 3/8/2022" +
                    "@3:00 PM"))
        }

    }

    private fun getQrCodeBitmap(tournamentInfo: String): Bitmap {
        val size = 512 //pixels
        val qrCodeContent = "$tournamentInfo;;"
        val hints = hashMapOf<EncodeHintType, Int>().also { it[EncodeHintType.MARGIN] = 1 } // Make the QR code buffer border narrower
        val bits = QRCodeWriter().encode(qrCodeContent, BarcodeFormat.QR_CODE, size, size)
        return Bitmap.createBitmap(size, size, Bitmap.Config.RGB_565).also {
            for (x in 0 until size) {
                for (y in 0 until size) {
                    it.setPixel(x, y, if (bits[x, y]) Color.BLACK else Color.WHITE)
                }
            }
        }
    }
}

