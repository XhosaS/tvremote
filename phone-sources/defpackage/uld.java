package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uld implements uki {
    public final Set a;
    public final uki b;
    private final Set c;
    private final Set d;

    public uld(ukh ukhVar, uki ukiVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (ukq ukqVar : ukhVar.c) {
            if (ukqVar.a()) {
                if (ukqVar.b()) {
                    hashSet4.add(ukqVar.a);
                } else {
                    hashSet.add(ukqVar.a);
                }
            } else if (ukqVar.b()) {
                hashSet5.add(ukqVar.a);
            } else {
                hashSet2.add(ukqVar.a);
            }
        }
        if (!ukhVar.g.isEmpty()) {
            hashSet.add(new ulb(ula.class, umq.class));
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet);
        this.d = DesugarCollections.unmodifiableSet(hashSet2);
        DesugarCollections.unmodifiableSet(hashSet3);
        this.a = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        Set set = ukhVar.g;
        this.b = ukiVar;
    }

    @Override // defpackage.uki
    public final unj a(ulb ulbVar) {
        if (this.d.contains(ulbVar)) {
            return this.b.a(ulbVar);
        }
        throw new uks(String.format("Attempting to request an undeclared dependency Provider<%s>.", ulbVar));
    }

    @Override // defpackage.uki
    public final unj b(Class cls) {
        return a(new ulb(ula.class, cls));
    }

    @Override // defpackage.uki
    public final unj c(ulb ulbVar) {
        throw null;
    }

    @Override // defpackage.uki
    public final Object d(ulb ulbVar) {
        if (this.c.contains(ulbVar)) {
            return uiv.b(this.b, ulbVar);
        }
        throw new uks(String.format("Attempting to request an undeclared dependency %s.", ulbVar));
    }

    @Override // defpackage.uki
    public final Object e(Class cls) {
        if (!this.c.contains(new ulb(ula.class, cls))) {
            throw new uks(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objC = uiv.c(this.b, cls);
        if (!cls.equals(umq.class)) {
            return objC;
        }
        return new ulc();
    }
}
