package defpackage;

import android.content.Context;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndm implements Iterable {
    public final ndl b;
    public final ndl c;
    public final ndl d;
    public final ndl e;
    public final ndl f;
    public final ndl g;
    public final ndj h;
    public boolean i;
    public final huo l;
    public final List a = new ArrayList(6);
    public float j = 75.0f;
    public float k = 25.0f;

    public ndm(Context context, ndl ndlVar, ndl ndlVar2, ndl ndlVar3, ndl ndlVar4, ndl ndlVar5, ndl ndlVar6, huo huoVar, ndj ndjVar) {
        int color = context.getColor(R.color.google_blue700);
        int color2 = context.getColor(R.color.google_red700);
        int color3 = context.getColor(R.color.google_yellow700);
        int color4 = context.getColor(R.color.google_green700);
        this.b = ndlVar;
        ndlVar.z(12.0f, 3.1415927f, 1.0f, color);
        this.c = ndlVar2;
        ndlVar2.z(4.0f, 3.1415927f, 1.0f, color2);
        this.d = ndlVar3;
        ndlVar3.z(4.0f, 0.0f, 1.0f, color3);
        this.e = ndlVar4;
        ndlVar4.z(12.0f, 0.0f, 1.0f, color4);
        this.f = ndlVar5;
        ndlVar5.z(8.0f, 0.0f, 0.0f, color);
        this.g = ndlVar6;
        ndlVar6.z(16.0f, 0.0f, 0.0f, color2);
        this.l = huoVar;
        this.h = ndjVar;
        ndjVar.e(1.0f);
        i(false);
    }

    public final float a(ndl ndlVar) {
        if (ndlVar == this.b) {
            return -16.0f;
        }
        if (ndlVar == this.c) {
            return -7.85f;
        }
        if (ndlVar == this.d) {
            return -2.55f;
        }
        if (ndlVar == this.e) {
            return 11.5f;
        }
        if (ndlVar == this.f) {
            return 6.7f;
        }
        if (ndlVar == this.g) {
            return 16.1f;
        }
        throw new IllegalArgumentException("Unknown dot");
    }

    public final float b() {
        return this.l.d();
    }

    public final int c(ndl ndlVar) {
        if (ndlVar == this.b) {
            return 0;
        }
        if (ndlVar == this.c) {
            return 1;
        }
        if (ndlVar == this.d) {
            return 2;
        }
        if (ndlVar == this.e) {
            return this.i ? 4 : 3;
        }
        if (ndlVar == this.f && this.i) {
            return 3;
        }
        if (ndlVar == this.g && this.i) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown or unexpected dot");
    }

    public final void d(float f) {
        this.h.c(f);
    }

    public final void e(float f) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ndl) it.next()).l(f);
        }
    }

    public final void f(float f, ndl ndlVar) {
        ndi ndiVar = ndlVar.b;
        float f2 = f - ndiVar.b;
        ndiVar.b(f2);
        Iterator<ndl> it = iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            if (next != ndlVar) {
                next.q(f2);
            }
        }
        this.l.e(-f2);
    }

    public final void g() {
        huo huoVar = this.l;
        ndj ndjVar = (ndj) huoVar.b;
        float f = ndjVar.c;
        ndj ndjVar2 = (ndj) huoVar.c;
        if (f != ndjVar2.d) {
            ndjVar2.d = f;
            ndjVar2.e = false;
        }
        ndjVar2.c(0.0f);
        ndjVar.e(0.0f);
        huoVar.a = false;
    }

    public final void h() {
        Iterator<ndl> it = iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            ndk ndkVar = next.a;
            ndkVar.e(ndkVar.b);
            ndi ndiVar = next.b;
            ndiVar.e(ndiVar.b);
            ndk ndkVar2 = next.c;
            ndkVar2.e(ndkVar2.b);
            ndk ndkVar3 = next.d;
            ndkVar3.e(ndkVar3.b);
            ndk ndkVar4 = next.e;
            ndkVar4.e(ndkVar4.b);
            ndj ndjVar = next.f;
            ndjVar.e(ndjVar.b);
            ndj ndjVar2 = next.h;
            ndjVar2.e(ndjVar2.b);
            ndj ndjVar3 = next.i;
            ndjVar3.e(ndjVar3.b);
            ndj ndjVar4 = next.g;
            ndjVar4.e(ndjVar4.b);
            ndj ndjVar5 = next.j;
            ndjVar5.e(ndjVar5.b);
        }
        huo huoVar = this.l;
        ndj ndjVar6 = (ndj) huoVar.b;
        ndjVar6.e(ndjVar6.b);
        ndj ndjVar7 = (ndj) huoVar.c;
        ndjVar7.e(ndjVar7.b);
        ndj ndjVar8 = this.h;
        ndjVar8.e(ndjVar8.b);
    }

    public final void i(boolean z) {
        List list = this.a;
        if (list.isEmpty()) {
            list.add(this.e);
            list.add(this.d);
            list.add(this.c);
            list.add(this.b);
        }
        if (z != this.i) {
            if (z) {
                list.add(1, this.f);
                list.add(0, this.g);
            } else {
                list.remove(this.f);
                list.remove(this.g);
            }
        }
        this.i = z;
    }

    @Override // java.lang.Iterable
    public final Iterator<ndl> iterator() {
        return this.a.iterator();
    }

    public final void j(float f) {
        huo huoVar = this.l;
        ((ndj) huoVar.b).c(f);
        huoVar.a = true;
    }

    public final void k() {
        huo huoVar = this.l;
        float fD = (-0.3926991f) - huoVar.d();
        huoVar.e(fD);
        Iterator<ndl> it = iterator();
        while (it.hasNext()) {
            it.next().q(-fD);
        }
    }
}
