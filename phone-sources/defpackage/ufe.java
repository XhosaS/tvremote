package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ufe extends ufc {
    @Override // defpackage.ufc
    public final uey a(ufj ufjVar, uey ueyVar) {
        uey ueyVar2;
        synchronized (ufjVar) {
            ueyVar2 = ufjVar.listenersField;
            if (ueyVar2 != ueyVar) {
                ufjVar.listenersField = ueyVar;
            }
        }
        return ueyVar2;
    }

    @Override // defpackage.ufc
    public final ufi b(ufj ufjVar, ufi ufiVar) {
        ufi ufiVar2;
        synchronized (ufjVar) {
            ufiVar2 = ufjVar.waitersField;
            if (ufiVar2 != ufiVar) {
                ufjVar.waitersField = ufiVar;
            }
        }
        return ufiVar2;
    }

    @Override // defpackage.ufc
    public final void c(ufi ufiVar, ufi ufiVar2) {
        ufiVar.next = ufiVar2;
    }

    @Override // defpackage.ufc
    public final void d(ufi ufiVar, Thread thread) {
        ufiVar.thread = thread;
    }

    @Override // defpackage.ufc
    public final boolean e(ufj ufjVar, uey ueyVar, uey ueyVar2) {
        synchronized (ufjVar) {
            if (ufjVar.listenersField != ueyVar) {
                return false;
            }
            ufjVar.listenersField = ueyVar2;
            return true;
        }
    }

    @Override // defpackage.ufc
    public final boolean f(ufj ufjVar, Object obj, Object obj2) {
        synchronized (ufjVar) {
            if (ufjVar.valueField != obj) {
                return false;
            }
            ufjVar.valueField = obj2;
            return true;
        }
    }

    @Override // defpackage.ufc
    public final boolean g(ufj ufjVar, ufi ufiVar, ufi ufiVar2) {
        synchronized (ufjVar) {
            if (ufjVar.waitersField != ufiVar) {
                return false;
            }
            ufjVar.waitersField = ufiVar2;
            return true;
        }
    }
}
