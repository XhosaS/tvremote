package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zuq extends zun {
    @Override // defpackage.zun
    public final zuj a(zuv zuvVar, zuj zujVar) {
        zuj zujVar2;
        synchronized (zuvVar) {
            zujVar2 = zuvVar.listenersField;
            if (zujVar2 != zujVar) {
                zuvVar.listenersField = zujVar;
            }
        }
        return zujVar2;
    }

    @Override // defpackage.zun
    public final zuu b(zuv zuvVar, zuu zuuVar) {
        zuu zuuVar2;
        synchronized (zuvVar) {
            zuuVar2 = zuvVar.waitersField;
            if (zuuVar2 != zuuVar) {
                zuvVar.waitersField = zuuVar;
            }
        }
        return zuuVar2;
    }

    @Override // defpackage.zun
    public final void c(zuu zuuVar, zuu zuuVar2) {
        zuuVar.next = zuuVar2;
    }

    @Override // defpackage.zun
    public final void d(zuu zuuVar, Thread thread) {
        zuuVar.thread = thread;
    }

    @Override // defpackage.zun
    public final boolean e(zuv zuvVar, zuj zujVar, zuj zujVar2) {
        synchronized (zuvVar) {
            if (zuvVar.listenersField != zujVar) {
                return false;
            }
            zuvVar.listenersField = zujVar2;
            return true;
        }
    }

    @Override // defpackage.zun
    public final boolean f(zuv zuvVar, Object obj, Object obj2) {
        synchronized (zuvVar) {
            if (zuvVar.valueField != obj) {
                return false;
            }
            zuvVar.valueField = obj2;
            return true;
        }
    }

    @Override // defpackage.zun
    public final boolean g(zuv zuvVar, zuu zuuVar, zuu zuuVar2) {
        synchronized (zuvVar) {
            if (zuvVar.waitersField != zuuVar) {
                return false;
            }
            zuvVar.waitersField = zuuVar2;
            return true;
        }
    }
}
