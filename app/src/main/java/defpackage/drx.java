package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;

/* compiled from: PG */
/* loaded from: classes.dex */
public class drx {
    public Canvas a;
    public int b;
    public int c;
    public final /* synthetic */ ComponentHost d;

    public drx(ComponentHost componentHost) {
        this.d = componentHost;
    }

    public final void a() {
        if (this.a == null) {
            return;
        }
        int i = this.b;
        ComponentHost componentHost = this.d;
        wy wyVar = componentHost.a;
        int iC = wyVar == null ? 0 : wyVar.c();
        while (i < iC) {
            int i2 = i + 1;
            elv elvVar = (elv) componentHost.a.d(i);
            Object obj = elvVar.a;
            if (obj instanceof View) {
                this.b = i2;
                return;
            }
            if (elvVar.c) {
                boolean z = ebc.a;
                ((Drawable) obj).draw(this.a);
            } else {
                componentHost.h++;
            }
            i = i2;
        }
        this.b = this.c;
    }

    public final boolean b() {
        return this.a != null && this.b < this.c;
    }
}
