package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zkg implements zih, zld {
    final int a;
    final int b;
    final eph c;

    public zkg(int i, int i2, eph ephVar) {
        this.a = i;
        this.b = i2;
        this.c = ephVar;
    }

    @Override // defpackage.zld
    public zjh j() {
        return this.c.G(this.a, this.b);
    }

    @Override // defpackage.zih
    public final zjh p() {
        try {
            return j();
        } catch (IOException e) {
            throw new zjg(e.getMessage());
        }
    }
}
