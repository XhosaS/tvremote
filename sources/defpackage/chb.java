package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class chb extends cgy {
    @Override // defpackage.cgy
    public final cgu a(chg chgVar, cgu cguVar) {
        cgu cguVar2;
        synchronized (chgVar) {
            cguVar2 = chgVar.listenersField;
            if (cguVar2 != cguVar) {
                chgVar.listenersField = cguVar;
            }
        }
        return cguVar2;
    }

    @Override // defpackage.cgy
    public final chf b(chg chgVar, chf chfVar) {
        chf chfVar2;
        synchronized (chgVar) {
            chfVar2 = chgVar.waitersField;
            if (chfVar2 != chfVar) {
                chgVar.waitersField = chfVar;
            }
        }
        return chfVar2;
    }

    @Override // defpackage.cgy
    public final void c(chf chfVar, chf chfVar2) {
        chfVar.next = chfVar2;
    }

    @Override // defpackage.cgy
    public final void d(chf chfVar, Thread thread) {
        chfVar.thread = thread;
    }

    @Override // defpackage.cgy
    public final boolean e(chg chgVar, cgu cguVar, cgu cguVar2) {
        synchronized (chgVar) {
            if (chgVar.listenersField != cguVar) {
                return false;
            }
            chgVar.listenersField = cguVar2;
            return true;
        }
    }

    @Override // defpackage.cgy
    public final boolean f(chg chgVar, Object obj, Object obj2) {
        synchronized (chgVar) {
            if (chgVar.valueField != obj) {
                return false;
            }
            chgVar.valueField = obj2;
            return true;
        }
    }

    @Override // defpackage.cgy
    public final boolean g(chg chgVar, chf chfVar, chf chfVar2) {
        synchronized (chgVar) {
            if (chgVar.waitersField != chfVar) {
                return false;
            }
            chgVar.waitersField = chfVar2;
            return true;
        }
    }
}
