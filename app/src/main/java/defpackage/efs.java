package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class efs {
    public ejq a;
    public boolean b;
    private boolean c;
    private boolean d;
    private boolean e;

    public final void a(View view) {
        if (!this.b || this.d) {
            return;
        }
        if (!this.e) {
            this.d = true;
            ejq ejqVar = this.a;
            if (ejqVar != null) {
                ejqVar.a(view, 1);
            }
            this.b = false;
        }
        this.e = false;
    }

    public final void b(View view) {
        if (!this.c && !this.d) {
            this.c = true;
            ejq ejqVar = this.a;
            if (ejqVar != null) {
                ejqVar.a(view, 0);
            }
        }
        this.e = true;
    }

    public final void c(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            if (!this.d) {
                this.b = false;
                this.e = true;
                return;
            } else {
                this.c = false;
                this.b = false;
                this.d = false;
                return;
            }
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !this.b && this.c && !this.d) {
            this.d = true;
            ejq ejqVar = this.a;
            if (ejqVar != null) {
                ejqVar.a(view, 1);
            }
        }
    }
}
