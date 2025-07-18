package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxj extends zgv {
    private final yyk a;

    public aaxj(String str, yyk yykVar) {
        super(str);
        this.a = yykVar;
    }

    @Override // defpackage.zft
    public final void b(zfp zfpVar) {
        int i = 0;
        while (true) {
            yyk yykVar = this.a;
            if (i >= ((zcg) yykVar).d) {
                return;
            }
            zft zftVar = (zft) yykVar.get(i);
            if (zfpVar.h() || zftVar.c(zfpVar.g())) {
                zftVar.b(zfpVar);
            }
            i++;
        }
    }

    @Override // defpackage.zft
    public final boolean c(Level level) {
        int i = 0;
        while (true) {
            yyk yykVar = this.a;
            if (i >= ((zcg) yykVar).d) {
                return false;
            }
            if (((zft) yykVar.get(i)).c(level)) {
                return true;
            }
            i++;
        }
    }
}
