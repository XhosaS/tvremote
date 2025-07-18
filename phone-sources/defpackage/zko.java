package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zko implements zje {
    private final /* synthetic */ int a;
    private final Object b;

    public zko(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    static zkb a(eph ephVar) {
        return new zkb(vxr.aO(new zki(ephVar)), null);
    }

    @Override // defpackage.zje
    public final InputStream b() {
        return this.a != 0 ? new zki((eph) this.b) : (InputStream) this.b;
    }

    @Override // defpackage.zld
    public final zjh j() {
        return this.a != 0 ? a((eph) this.b) : new zkn(((zlc) this.b).a());
    }

    @Override // defpackage.zih
    public final zjh p() {
        if (this.a != 0) {
            try {
                return j();
            } catch (IOException e) {
                throw new zjg("IOException converting stream to byte array: ".concat(String.valueOf(e.getMessage())), e);
            }
        }
        try {
            return j();
        } catch (IOException e2) {
            throw new zjg("IOException converting stream to byte array: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }
}
