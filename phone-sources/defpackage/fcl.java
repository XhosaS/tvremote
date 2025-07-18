package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcl extends ehv {
    private final ehk f;
    private final edi g;
    private fck h;
    private long i;

    public fcl() {
        super(6);
        this.f = new ehk(1);
        this.g = new edi();
    }

    private final void W() {
        fck fckVar = this.h;
        if (fckVar != null) {
            fckVar.b();
        }
    }

    @Override // defpackage.ekc, defpackage.eke
    public final String U() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.ekc
    public final void V(long j, long j2) {
        float[] fArr;
        while (!O() && this.i < 100000 + j) {
            ehk ehkVar = this.f;
            ehkVar.clear();
            if (S(T(), ehkVar, 0) != -4 || ehkVar.isEndOfStream()) {
                return;
            }
            long j3 = ehkVar.e;
            this.i = j3;
            long j4 = this.c;
            if (this.h != null && j3 >= j4) {
                ehkVar.b();
                ByteBuffer byteBuffer = ehkVar.c;
                String str = edt.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    edi ediVar = this.g;
                    ediVar.I(byteBuffer.array(), byteBuffer.limit());
                    ediVar.K(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(ediVar.f());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.h.a(this.i - this.b, fArr);
                }
            }
        }
    }

    @Override // defpackage.ekc
    public final boolean cH() {
        return O();
    }

    @Override // defpackage.ekc
    public final boolean cI() {
        return true;
    }

    @Override // defpackage.eke
    public final int cJ(dze dzeVar) {
        return clw.F(true != "application/x-camera-motion".equals(dzeVar.Y) ? 0 : 4);
    }

    @Override // defpackage.ehv, defpackage.ejz
    public final void s(int i, Object obj) {
        if (i == 8) {
            this.h = (fck) obj;
        }
    }

    @Override // defpackage.ehv
    protected final void v() {
        W();
    }

    @Override // defpackage.ehv
    protected final void x(long j, boolean z) {
        this.i = Long.MIN_VALUE;
        W();
    }
}
