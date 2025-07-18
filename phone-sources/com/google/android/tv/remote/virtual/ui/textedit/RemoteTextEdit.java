package com.google.android.tv.remote.virtual.ui.textedit;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import com.google.android.videos.R;
import defpackage.oyn;
import defpackage.tlu;
import defpackage.tlx;
import defpackage.tmw;
import defpackage.tmx;
import defpackage.tmy;
import defpackage.tng;
import defpackage.ulo;
import defpackage.vtw;
import defpackage.vuc;
import defpackage.xqr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteTextEdit extends AppCompatEditText {
    public tlu a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public xqr g;
    private int h;
    private ulo i;

    public RemoteTextEdit(Context context) {
        this(context, null);
    }

    private final ulo a() {
        tlu tluVar = this.a;
        int i = this.b;
        int i2 = this.c;
        tlx tlxVar = tluVar.a;
        tlxVar.getClass();
        return new ulo(i, i2, new oyn(tlxVar, 6));
    }

    @Override // android.widget.TextView
    public final void onBeginBatchEdit() {
        if (this.d) {
            int i = this.h + 1;
            this.h = i;
            if (i == 1) {
                this.i = a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void onEditorAction(int i) {
        boolean z = this.i == null;
        if (z) {
            this.i = a();
        }
        ulo uloVar = this.i;
        Object obj = uloVar.b;
        vtw vtwVarM = tmy.a.m();
        vtw vtwVarM2 = tmw.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        tmw tmwVar = (tmw) vtwVarM2.b;
        tmwVar.b = 1 | tmwVar.b;
        tmwVar.c = i;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        tmy tmyVar = (tmy) vtwVarM.b;
        tmw tmwVar2 = (tmw) vtwVarM2.r();
        tmwVar2.getClass();
        tmyVar.c = tmwVar2;
        tmyVar.b = 5;
        ((vtw) obj).bw(vtwVarM);
        this.i = uloVar;
        if (z) {
            uloVar.g();
            this.i = null;
        }
    }

    @Override // android.widget.TextView
    public final void onEndBatchEdit() {
        if (this.d) {
            int i = this.h - 1;
            this.h = i;
            if (i == 0) {
                this.i.g();
                this.i = null;
            }
        }
    }

    @Override // android.widget.TextView
    protected final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.d && this.a != null) {
            if (this.e == i && this.f == i2) {
                return;
            }
            this.g.c(i, i2, getText());
            this.e = i;
            this.f = i2;
            boolean z = this.i == null;
            if (z) {
                this.i = a();
            }
            ulo uloVar = this.i;
            Object obj = uloVar.b;
            vtw vtwVarM = tmy.a.m();
            vtw vtwVarM2 = tng.a.m();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar = vtwVarM2.b;
            tng tngVar = (tng) vucVar;
            tngVar.b |= 1;
            tngVar.c = i;
            if (!vucVar.A()) {
                vtwVarM2.u();
            }
            tng tngVar2 = (tng) vtwVarM2.b;
            tngVar2.b |= 2;
            tngVar2.d = i2;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            tmy tmyVar = (tmy) vtwVarM.b;
            tng tngVar3 = (tng) vtwVarM2.r();
            tngVar3.getClass();
            tmyVar.c = tngVar3;
            tmyVar.b = 1;
            ((vtw) obj).bw(vtwVarM);
            this.i = uloVar;
            if (z) {
                uloVar.g();
                this.i = null;
            }
        }
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.d && this.a != null) {
            String string = charSequence.toString();
            int i4 = i3 + i;
            this.e = i4;
            this.f = i4;
            this.g.c(i4, i4, string);
            boolean z = this.i == null;
            if (z) {
                this.i = a();
            }
            ulo uloVar = this.i;
            int i5 = i2 + i;
            String strSubstring = string.substring(i, this.e);
            Object obj = uloVar.b;
            vtw vtwVarM = tmy.a.m();
            vtw vtwVarM2 = tmx.a.m();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar = vtwVarM2.b;
            tmx tmxVar = (tmx) vucVar;
            tmxVar.b = 1 | tmxVar.b;
            tmxVar.c = i;
            if (!vucVar.A()) {
                vtwVarM2.u();
            }
            vuc vucVar2 = vtwVarM2.b;
            tmx tmxVar2 = (tmx) vucVar2;
            tmxVar2.b |= 2;
            tmxVar2.d = i5;
            if (!vucVar2.A()) {
                vtwVarM2.u();
            }
            tmx tmxVar3 = (tmx) vtwVarM2.b;
            strSubstring.getClass();
            tmxVar3.b |= 4;
            tmxVar3.e = strSubstring;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            tmy tmyVar = (tmy) vtwVarM.b;
            tmx tmxVar4 = (tmx) vtwVarM2.r();
            tmxVar4.getClass();
            tmyVar.c = tmxVar4;
            tmyVar.b = 2;
            ((vtw) obj).bw(vtwVarM);
            this.i = uloVar;
            if (z) {
                uloVar.g();
                this.i = null;
            }
        }
    }

    public RemoteTextEdit(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public RemoteTextEdit(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new xqr(0);
        setSaveEnabled(false);
        this.d = true;
    }
}
