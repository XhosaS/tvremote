package com.google.android.play.search;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.tbx;
import defpackage.tgw;
import defpackage.tgx;
import defpackage.tha;
import defpackage.thh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaySearchPlateTextContainer extends FrameLayout implements TextWatcher, TextView.OnEditorActionListener, tgx {
    public tgw a;
    public thh b;
    public ImageView c;
    public EditText d;
    private final InputMethodManager e;
    private TextView f;
    private boolean g;

    public PlaySearchPlateTextContainer(Context context) {
        this(context, null);
    }

    private final void c(String str) {
        if (this.a.b != 3 || this.d.getText().toString().equals(str)) {
            return;
        }
        this.g = true;
        this.d.setText(str);
        this.d.setSelection(str.length());
        this.g = false;
    }

    private final void f() {
        if (TextUtils.getTrimmedLength(this.a.d) > 0) {
            this.a.c();
        }
    }

    private final void g() {
        this.e.hideSoftInputFromWindow(this.d.getWindowToken(), 0);
    }

    @Override // defpackage.tgx
    public final void d(int i) {
        thh thhVar;
        if (i == 1) {
            this.c.setVisibility(0);
            this.f.setVisibility(8);
            this.d.setVisibility(8);
            this.d.setOnEditorActionListener(null);
            this.d.setOnClickListener(null);
            g();
            this.d.removeTextChangedListener(this);
            return;
        }
        if (i == 2) {
            this.c.setVisibility(8);
            this.f.setVisibility(0);
            this.d.setVisibility(8);
            this.d.setOnEditorActionListener(null);
            g();
            this.d.removeTextChangedListener(this);
            return;
        }
        if (i == 3) {
            this.c.setVisibility(8);
            this.f.setVisibility(8);
            this.d.setVisibility(0);
            this.d.addTextChangedListener(this);
            this.d.setOnEditorActionListener(this);
            this.d.setOnClickListener(null);
            this.d.requestFocus();
            this.e.showSoftInput(this.d, 0);
            tgw tgwVar = this.a;
            if (tgwVar != null) {
                tgwVar.b(true);
            }
            c(this.a.d);
            return;
        }
        if (i != 4) {
            return;
        }
        tgw tgwVar2 = this.a;
        if (tgwVar2 != null) {
            tgwVar2.f("");
        }
        if (this.a != null && (thhVar = this.b) != null) {
            Context context = getContext();
            Intent intent = new Intent("com.google.android.play.search.VOICE_SEARCH_RESULT");
            intent.setPackage(context.getPackageName());
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, (Build.VERSION.SDK_INT > 30 ? 33554432 : 0) | 1073741824);
            Intent intent2 = new Intent(thh.a);
            intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", broadcast);
            if (!thhVar.b) {
                context.registerReceiver(thhVar, new IntentFilter("com.google.android.play.search.VOICE_SEARCH_RESULT"));
                thhVar.b = true;
            }
            context.startActivity(intent2);
        }
        g();
        this.d.removeTextChangedListener(this);
    }

    @Override // defpackage.tgx
    public final void e(String str, boolean z) {
        this.f.setText(str);
        c(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        thh thhVar = this.b;
        if (thhVar != null) {
            thhVar.a(getContext());
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            f();
            return true;
        }
        if (keyEvent == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 66 && keyCode != 160 && keyCode != 84) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            f();
        }
        return true;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ImageView) findViewById(R.id.search_box_idle_text);
        this.f = (TextView) findViewById(R.id.search_box_active_text_view);
        this.d = (EditText) findViewById(R.id.search_box_text_input);
        tbx tbxVar = new tbx((View) this, 7);
        this.c.setOnClickListener(tbxVar);
        this.f.setOnClickListener(tbxVar);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        tgw tgwVar = this.a;
        if (tgwVar == null || this.g) {
            return;
        }
        tgwVar.f(charSequence.toString());
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        tgw tgwVar;
        super.onWindowFocusChanged(z);
        if (z && (tgwVar = this.a) != null && tgwVar.b == 4) {
            thh thhVar = this.b;
            if (thhVar != null) {
                thhVar.a(getContext());
            }
            if (!TextUtils.isEmpty(this.a.d)) {
                this.a.c();
            } else if (hasFocus()) {
                this.a.e(3);
            } else {
                this.a.h();
            }
        }
    }

    public PlaySearchPlateTextContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchPlateTextContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = (InputMethodManager) context.getSystemService("input_method");
    }

    @Override // defpackage.tgx
    public final void m() {
    }

    @Override // defpackage.tgx
    public final void a(String str) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // defpackage.tgx
    public final void b(tha thaVar) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
