package defpackage;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabk {
    public static final aabk a = (aabk) aaci.a(new aach() { // from class: aabi
        @Override // defpackage.aach
        public final Object a() {
            aabk aabkVar = new aabk();
            aabkVar.c(new aaat(aaaz.class, aaby.class, new aaau() { // from class: aabj
                @Override // defpackage.aaau
                public final aacc a(zzn zznVar) {
                    aaby aabyVar = ((aaaz) zznVar).a;
                    aaaz.a(aabyVar);
                    return aabyVar;
                }
            }));
            return aabkVar;
        }
    });
    public final AtomicReference b = new AtomicReference(new aacg(new aacd()));

    public final zzn a(aacc aaccVar, zzx zzxVar) {
        aacg aacgVar = (aacg) this.b.get();
        aace aaceVar = new aace(aaccVar.getClass(), ((aaby) aaccVar).b);
        Map map = aacgVar.b;
        if (map.containsKey(aaceVar)) {
            return ((aaas) map.get(aaceVar)).a(aaccVar);
        }
        throw new GeneralSecurityException(a.t(aaceVar, "No Key Parser for requested key type ", " available"));
    }

    public final synchronized void b(aaas aaasVar) {
        AtomicReference atomicReference = this.b;
        aacd aacdVar = new aacd((aacg) atomicReference.get());
        aace aaceVar = new aace(aaasVar.c, aaasVar.b);
        Map map = aacdVar.b;
        if (map.containsKey(aaceVar)) {
            aaas aaasVar2 = (aaas) map.get(aaceVar);
            if (!aaasVar2.equals(aaasVar) || !aaasVar.equals(aaasVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(aaceVar.toString()));
            }
        } else {
            map.put(aaceVar, aaasVar);
        }
        atomicReference.set(new aacg(aacdVar));
    }

    public final synchronized void c(aaav aaavVar) {
        AtomicReference atomicReference = this.b;
        aacd aacdVar = new aacd((aacg) atomicReference.get());
        aacf aacfVar = new aacf(aaavVar.b, aaavVar.c);
        Map map = aacdVar.a;
        if (map.containsKey(aacfVar)) {
            aaav aaavVar2 = (aaav) map.get(aacfVar);
            if (!aaavVar2.equals(aaavVar) || !aaavVar.equals(aaavVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(aacfVar.toString()));
            }
        } else {
            map.put(aacfVar, aaavVar);
        }
        atomicReference.set(new aacg(aacdVar));
    }

    public final synchronized void d(aabn aabnVar) {
        AtomicReference atomicReference = this.b;
        aacd aacdVar = new aacd((aacg) atomicReference.get());
        aace aaceVar = new aace(aabnVar.b, aabnVar.a);
        Map map = aacdVar.d;
        if (map.containsKey(aaceVar)) {
            aabn aabnVar2 = (aabn) map.get(aaceVar);
            if (!aabnVar2.equals(aabnVar) || !aabnVar.equals(aabnVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(aaceVar.toString()));
            }
        } else {
            map.put(aaceVar, aabnVar);
        }
        atomicReference.set(new aacg(aacdVar));
    }

    public final synchronized void e(aabp aabpVar) {
        AtomicReference atomicReference = this.b;
        aacd aacdVar = new aacd((aacg) atomicReference.get());
        aacf aacfVar = new aacf(aabpVar.a, aabpVar.b);
        Map map = aacdVar.c;
        if (map.containsKey(aacfVar)) {
            aabp aabpVar2 = (aabp) map.get(aacfVar);
            if (!aabpVar2.equals(aabpVar) || !aabpVar.equals(aabpVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(aacfVar.toString()));
            }
        } else {
            map.put(aacfVar, aabpVar);
        }
        atomicReference.set(new aacg(aacdVar));
    }
}
