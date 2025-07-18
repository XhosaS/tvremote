package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aghd implements aggi {
    public static final aghd a;
    private static final /* synthetic */ aghd[] b;

    static {
        aghd aghdVar = new aghd();
        a = aghdVar;
        b = new aghd[]{aghdVar};
    }

    private aghd() {
    }

    public static void a() {
        agoh.e(new aggt("Disposable already set!"));
    }

    public static boolean b(aggi aggiVar) {
        return aggiVar == a;
    }

    public static boolean c(AtomicReference atomicReference, aggi aggiVar) {
        aghn.b(aggiVar, "d is null");
        if (aghc.a(atomicReference, null, aggiVar)) {
            return true;
        }
        aggiVar.dispose();
        if (atomicReference.get() == a) {
            return false;
        }
        a();
        return false;
    }

    public static boolean d(aggi aggiVar, aggi aggiVar2) {
        if (aggiVar2 == null) {
            agoh.e(new NullPointerException("next is null"));
            return false;
        }
        if (aggiVar == null) {
            return true;
        }
        aggiVar2.dispose();
        a();
        return false;
    }

    public static void e(AtomicReference atomicReference) {
        aggi aggiVar;
        aggi aggiVar2 = (aggi) atomicReference.get();
        aghd aghdVar = a;
        if (aggiVar2 == aghdVar || (aggiVar = (aggi) atomicReference.getAndSet(aghdVar)) == aghdVar || aggiVar == null) {
            return;
        }
        aggiVar.dispose();
    }

    public static void g(AtomicReference atomicReference, aggi aggiVar) {
        aggi aggiVar2;
        do {
            aggiVar2 = (aggi) atomicReference.get();
            if (aggiVar2 == a) {
                if (aggiVar != null) {
                    aggiVar.dispose();
                    return;
                }
                return;
            }
        } while (!aghc.a(atomicReference, aggiVar2, aggiVar));
    }

    public static void h(AtomicReference atomicReference, aggi aggiVar) {
        aggi aggiVar2;
        do {
            aggiVar2 = (aggi) atomicReference.get();
            if (aggiVar2 == a) {
                aggiVar.dispose();
                return;
            }
        } while (!aghc.a(atomicReference, aggiVar2, aggiVar));
        if (aggiVar2 != null) {
            aggiVar2.dispose();
        }
    }

    public static aghd[] values() {
        return (aghd[]) b.clone();
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.aggi
    public final void dispose() {
    }
}
