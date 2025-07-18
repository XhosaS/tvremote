package com.google.android.apps.googletv.app.presentation.pages.webview;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.videos.R;
import defpackage.kir;
import defpackage.krd;
import defpackage.kwy;
import defpackage.lfn;
import defpackage.rtx;
import defpackage.vtw;
import defpackage.vuc;
import defpackage.woi;
import defpackage.xcf;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WebViewActivity extends xcf {
    public static final kir Companion = new kir();
    public static final String URL_MIME_TYPE = "text/plain";
    public lfn a;
    public kwy b;
    private String c;

    public WebViewActivity() {
        rtx.a.c();
    }

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lfn lfnVar = this.a;
        if (lfnVar == null) {
            yks.c("config");
            lfnVar = null;
        }
        if (lfnVar.cJ()) {
            setTheme(R.style.Theme_GoogleTv_Light);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        setContentView(R.layout.web_view_layout);
        String stringExtra = getIntent().getStringExtra("web_url");
        this.c = stringExtra;
        if (stringExtra != null) {
            WebView webView = (WebView) findViewById(R.id.webview);
            String str = this.c;
            str.getClass();
            webView.loadUrl(str);
        } else {
            toString();
            krd.c("Web Url is null for ".concat(toString()));
            Toast.makeText(getApplicationContext(), R.string.web_activity_need_url, 1).show();
            finish();
        }
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setTitle(this.c);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.app_bar_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.action_share) {
            String str = this.c;
            if (str == null || str.length() == 0) {
                krd.c("Web URL is null, can not share");
            } else {
                kwy kwyVar = this.b;
                if (kwyVar == null) {
                    yks.c("sharingManager");
                    kwyVar = null;
                }
                vtw vtwVarM = woi.a.m();
                vtwVarM.getClass();
                String str2 = this.c;
                str2.getClass();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                ((woi) vucVar).c = str2;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                ((woi) vtwVarM.b).d = URL_MIME_TYPE;
                vuc vucVarR = vtwVarM.r();
                vucVarR.getClass();
                kwyVar.a(this, (woi) vucVarR);
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
