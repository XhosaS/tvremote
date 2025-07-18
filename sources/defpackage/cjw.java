package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjw extends cee {
    private final bzs a;

    public cjw(String str, bzs bzsVar) {
        super(str);
        this.a = bzsVar;
    }

    @Override // defpackage.cdd
    public final void b(cdb cdbVar) {
        int i = 0;
        while (true) {
            bzs bzsVar = this.a;
            if (i >= ((cax) bzsVar).c) {
                return;
            }
            cdd cddVar = (cdd) bzsVar.get(i);
            if (cdbVar.E() || cddVar.c(cdbVar.n())) {
                cddVar.b(cdbVar);
            }
            i++;
        }
    }

    @Override // defpackage.cdd
    public final boolean c(Level level) {
        int i = 0;
        while (true) {
            bzs bzsVar = this.a;
            if (i >= ((cax) bzsVar).c) {
                return false;
            }
            if (((cdd) bzsVar.get(i)).c(level)) {
                return true;
            }
            i++;
        }
    }
}
