package defpackage;

import android.graphics.Typeface;
import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dqy {
    static final wt a = new wt(100);
    public int b = 2;
    public int c = Integer.MAX_VALUE;
    public int d = 2;
    public final dqx e = new dqx();
    public Layout f = null;
    public boolean g = true;

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f A[Catch: IndexOutOfBoundsException -> 0x0143, TryCatch #0 {IndexOutOfBoundsException -> 0x0143, blocks: (B:50:0x00df, B:52:0x0101, B:68:0x0126, B:53:0x0104, B:55:0x0108, B:56:0x010b, B:58:0x010f, B:59:0x0112, B:61:0x0116, B:62:0x0119, B:64:0x011d, B:65:0x0120, B:67:0x0124), top: B:87:0x00df }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.text.Layout a() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqy.a():android.text.Layout");
    }

    public final void b(int i) {
        dqx dqxVar = this.e;
        float f = i;
        if (dqxVar.a.getTextSize() != f) {
            dqxVar.a();
            dqxVar.a.setTextSize(f);
            this.f = null;
        }
    }

    public final void c(Typeface typeface) {
        dqx dqxVar = this.e;
        if (dqxVar.a.getTypeface() != typeface) {
            dqxVar.a();
            dqxVar.a.setTypeface(typeface);
            this.f = null;
        }
    }
}
