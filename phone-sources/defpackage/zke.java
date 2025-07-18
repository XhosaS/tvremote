package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zke implements zih, zld {
    private final /* synthetic */ int a;
    private final eph b;

    public zke(eph ephVar, int i) {
        this.a = i;
        this.b = ephVar;
    }

    static zkd a(eph ephVar) {
        return new zkd(ephVar.F());
    }

    static zkc b(eph ephVar) {
        return new zkc(ephVar.F());
    }

    static zkv c(eph ephVar) throws zil {
        try {
            return new zkv(new zky(ephVar.F()));
        } catch (IllegalArgumentException e) {
            throw new zil(e.getMessage(), e);
        }
    }

    @Override // defpackage.zld
    public final zjh j() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? zkw.b(this.b.F()) : zkw.a(this.b.F()) : c(this.b) : b(this.b) : a(this.b);
    }

    @Override // defpackage.zih
    public final zjh p() {
        int i = this.a;
        if (i == 0) {
            try {
                return j();
            } catch (IOException e) {
                throw new zjg(e.getMessage(), e);
            }
        }
        if (i == 1) {
            try {
                return j();
            } catch (IOException e2) {
                throw new IllegalStateException(e2.getMessage());
            }
        }
        if (i == 2) {
            try {
                return j();
            } catch (IOException e3) {
                throw new zjg("unable to get DER object", e3);
            } catch (IllegalArgumentException e4) {
                throw new zjg("unable to get DER object", e4);
            }
        }
        if (i != 3) {
            try {
                return j();
            } catch (IOException e5) {
                throw new zjg(e5.getMessage(), e5);
            }
        }
        try {
            return j();
        } catch (IOException e6) {
            throw new IllegalStateException(e6.getMessage());
        }
    }
}
