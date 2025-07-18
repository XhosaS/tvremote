package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mzo {
    public mul a;
    public String b;
    public ImmutableList c;
    public tst d;
    public kys e;
    public tst f;

    public mzo() {
        throw null;
    }

    public final void a(tst tstVar) {
        if (tstVar == null) {
            throw new NullPointerException("Null moduleBackground");
        }
        this.f = tstVar;
    }

    public final void b(tst tstVar) {
        if (tstVar == null) {
            throw new NullPointerException("Null paginationToken");
        }
        this.d = tstVar;
    }

    public final void c(kys kysVar) {
        if (kysVar == null) {
            throw new NullPointerException("Null serverCookie");
        }
        this.e = kysVar;
    }

    public final void d(List list) {
        this.c = ImmutableList.copyOf((Collection) list);
    }

    public mzo(byte[] bArr) {
        trk trkVar = trk.a;
        this.d = trkVar;
        this.f = trkVar;
    }
}
