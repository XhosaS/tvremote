package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqb {
    public String a;
    public String b;
    public String c;
    public tst d;
    public tst e;
    public tst f;
    public tst g;
    public tst h;
    public tst i;
    public tst j;
    public tst k;
    public tst l;
    public tst m;
    public tst n;
    public tst o;
    public ImmutableList p;
    public tst q;
    public tst r;
    public ImmutableList s;

    public lqb() {
        throw null;
    }

    public final void a(List list) {
        this.s = ImmutableList.copyOf((Collection) list);
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null collectionId");
        }
        this.a = str;
    }

    public final void c(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null images");
        }
        this.p = immutableList;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null subtitle");
        }
        this.c = str;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
    }

    public lqb(byte[] bArr) {
        trk trkVar = trk.a;
        this.d = trkVar;
        this.e = trkVar;
        this.f = trkVar;
        this.g = trkVar;
        this.h = trkVar;
        this.i = trkVar;
        this.j = trkVar;
        this.k = trkVar;
        this.l = trkVar;
        this.m = trkVar;
        this.n = trkVar;
        this.o = trkVar;
        this.q = trkVar;
        this.r = trkVar;
    }
}
