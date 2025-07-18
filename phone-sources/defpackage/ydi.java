package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydi {
    public int b;
    public int c;
    final /* synthetic */ ydl e;
    private final int f;
    private final ydh g;
    public final zgk a = new zgk();
    public boolean d = false;

    public ydi(ydl ydlVar, int i, int i2, ydh ydhVar) {
        this.e = ydlVar;
        this.f = i;
        this.b = i2;
        this.g = ydhVar;
    }

    final int a() {
        return Math.max(0, Math.min(this.b, (int) this.a.b)) - this.c;
    }

    final int b() {
        return Math.min(this.b, ((ydi) this.e.d).b);
    }

    final void c(zgk zgkVar, int i, boolean z) {
        while (true) {
            ydl ydlVar = this.e;
            Object obj = ydlVar.c;
            yeb yebVar = ((yck) ((ycj) obj).b).a;
            int iMin = Math.min(i, ((yej) yebVar).a);
            int i2 = -iMin;
            ((ydi) ydlVar.d).f(i2);
            f(i2);
            try {
                boolean z2 = false;
                if (zgkVar.b == iMin && z) {
                    z2 = true;
                }
                boolean z3 = z2;
                int i3 = this.f;
                zgk zgkVar2 = zgkVar;
                ((ycj) obj).c.l(2, i3, zgkVar2, iMin, z3);
                try {
                    yebVar.b(z3, i3, zgkVar2, iMin);
                } catch (IOException e) {
                    ((ycj) obj).a.d(e);
                }
                this.g.g(iMin);
                i -= iMin;
                if (i <= 0) {
                    return;
                } else {
                    zgkVar = zgkVar2;
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    final boolean d() {
        return this.a.b > 0;
    }

    final void e(int i, ydk ydkVar) {
        int iMin = Math.min(i, b());
        int i2 = 0;
        while (d() && iMin > 0) {
            zgk zgkVar = this.a;
            long j = iMin;
            long j2 = zgkVar.b;
            if (j >= j2) {
                int i3 = (int) j2;
                i2 += i3;
                c(zgkVar, i3, this.d);
            } else {
                i2 += iMin;
                c(zgkVar, iMin, false);
            }
            ydkVar.a++;
            iMin = Math.min(i - i2, b());
        }
    }

    final void f(int i) {
        if (i <= 0 || ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i >= this.b) {
            this.b += i;
            return;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f);
    }
}
