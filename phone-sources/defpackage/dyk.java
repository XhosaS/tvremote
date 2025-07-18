package defpackage;

import android.media.VolumeProvider;
import android.os.Build;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class dyk {
    public int a;
    private final int b;
    private final int c;
    private final String d;
    private VolumeProvider e;

    public dyk(int i, int i2, int i3, String str) {
        this.b = i;
        this.c = i2;
        this.a = i3;
        this.d = str;
    }

    public final Object a() {
        dyk dykVar;
        if (this.e != null) {
            dykVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            dykVar = this;
            dykVar.e = new dyi(dykVar, this.b, this.c, this.a, this.d);
        } else {
            dykVar = this;
            dykVar.e = new dyj(this, dykVar.b, dykVar.c, dykVar.a);
        }
        return dykVar.e;
    }

    public void b(int i) {
        throw null;
    }

    public void c(int i) {
        throw null;
    }
}
