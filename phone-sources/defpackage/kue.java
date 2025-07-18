package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kue implements kst {
    public final kuf a;
    public final String b;
    public final Uri c;
    public final int d;
    private final Uri e;
    private final Float f;
    private final List g;
    private final List h;

    public kue(kuf kufVar, String str, Uri uri, Uri uri2, Float f, List list, int i, List list2) {
        this.a = kufVar;
        this.b = str;
        this.c = uri;
        this.e = uri2;
        this.f = f;
        this.g = list;
        this.d = i;
        this.h = list2;
    }

    @Override // defpackage.kum
    public final String dX() {
        return o().c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kue kueVar = (kue) obj;
        if (this.d == kueVar.d && this.a.equals(kueVar.a) && this.b.equals(kueVar.b) && this.c.equals(kueVar.c) && this.e.equals(kueVar.e) && this.f.equals(kueVar.f) && this.g.equals(kueVar.g)) {
            return this.h.equals(kueVar.h);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.d) * 31) + this.h.hashCode();
    }

    @Override // defpackage.kst
    public final ksy o() {
        return ksy.g(this.a);
    }
}
