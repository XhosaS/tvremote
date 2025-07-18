package com.google.android.apps.googletv.app.presentation.pages.sharing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.videos.R;
import defpackage.by;
import defpackage.kfw;
import defpackage.krd;
import defpackage.yks;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SendTextToClipboardActivity extends by {
    public static final kfw Companion = new kfw();

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        if (yks.e("android.intent.action.SEND", getIntent().getAction())) {
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) getIntent().getParcelableExtra("android.intent.extra.STREAM", Uri.class) : (Uri) getIntent().getParcelableExtra("android.intent.extra.STREAM");
            if (uri != null && yks.e("content", uri.getScheme())) {
                Objects.toString(uri);
                krd.e("Content URI not allowed here: ".concat(uri.toString()));
            }
            String stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT");
            if (stringExtra == null) {
                stringExtra = String.valueOf(uri);
            }
            String stringExtra2 = getIntent().getStringExtra("android.intent.extra.SUBJECT");
            if (stringExtra2 == null) {
                krd.e("No label for clipboard data [" + stringExtra + ", " + uri + "]");
                stringExtra2 = "";
            }
            Object systemService = getSystemService("clipboard");
            systemService.getClass();
            ClipboardManager clipboardManager = (ClipboardManager) systemService;
            ClipData clipDataNewPlainText = ClipData.newPlainText(stringExtra2, stringExtra);
            if (clipDataNewPlainText == null) {
                krd.f("Error constructing ClipData(label length " + stringExtra2.length() + ", text length " + stringExtra.length() + ");falling back to pre-Honeycomb setText()");
                clipboardManager.setText(stringExtra);
            } else {
                clipboardManager.setPrimaryClip(clipDataNewPlainText);
            }
            if (Build.VERSION.SDK_INT <= 32) {
                Toast.makeText(this, R.string.copied_to_clipboard, 0).show();
            }
            setResult(-1);
        }
        finish();
    }
}
