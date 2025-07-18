package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksv {
    public String a;
    public String b;
    public tst c;
    public kys d;
    public ImmutableList e;
    public tst f;
    public tst g;
    public ImmutableList h;

    public ksv() {
        throw null;
    }

    public final void a(List list) {
        this.e = ImmutableList.copyOf((Collection) list);
    }

    public final void b(List list) {
        this.h = ImmutableList.copyOf((Collection) list);
    }

    public final void c(tst tstVar) {
        if (tstVar == null) {
            throw new NullPointerException("Null moduleBackground");
        }
        this.g = tstVar;
    }

    public final void d(tst tstVar) {
        if (tstVar == null) {
            throw new NullPointerException("Null paginationToken");
        }
        this.f = tstVar;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
    }

    public ksv(byte[] bArr) {
        trk trkVar = trk.a;
        this.c = trkVar;
        this.f = trkVar;
        this.g = trkVar;
    }
}
