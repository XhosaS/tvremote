package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyp {
    public final fwr a;
    public dvd b;
    public final String c;
    public final ghd d;
    public boolean e;
    public final dvl f;
    public dvd g;
    public final dwx h;
    public final fww i;
    private final fxb j;
    private final Bundle k;
    private final Bundle l;
    private final yft m;

    public fyp(fwr fwrVar) {
        this.a = fwrVar;
        this.j = fwrVar.a;
        this.k = fwrVar.b;
        this.b = fwrVar.c;
        this.i = fwrVar.g;
        this.c = fwrVar.d;
        this.l = fwrVar.e;
        this.d = gez.y(fwrVar);
        yga ygaVar = new yga(new awl(19));
        this.m = ygaVar;
        this.f = new dvl(fwrVar);
        this.g = dvd.b;
        this.h = (dwq) ygaVar.a();
    }

    public final Bundle a() {
        Bundle bundle = this.k;
        if (bundle == null) {
            return null;
        }
        Bundle bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
        bundleJ.putAll(bundle);
        return bundleJ;
    }

    public final void b(dvd dvdVar) {
        dvdVar.getClass();
        this.g = dvdVar;
        c();
    }

    public final void c() {
        if (!this.e) {
            ghd ghdVar = this.d;
            ghdVar.a();
            this.e = true;
            if (this.i != null) {
                dwn.c(this.a);
            }
            ghdVar.b(this.l);
        }
        if (this.b.ordinal() < this.g.ordinal()) {
            this.f.f(this.b);
        } else {
            this.f.f(this.g);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = ylg.a;
        sb.append(new ykl(this.a.getClass()).c());
        sb.append("(" + this.c + ')');
        sb.append(" destination=");
        sb.append(this.j);
        return sb.toString();
    }
}
