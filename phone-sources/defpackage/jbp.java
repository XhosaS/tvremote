package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jbp implements View.OnClickListener {
    private long a;
    private int b;

    public abstract void a(int i);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 1;
        if (jCurrentTimeMillis - this.a < 700) {
            i = 1 + this.b;
            this.b = i;
        } else {
            this.b = 1;
        }
        a(i);
        this.a = jCurrentTimeMillis;
    }
}
