package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajl implements aaih {
    public final Set a;
    public final aaih b;
    private final Set c;
    private final Set d;

    public aajl(aaif aaifVar, aaih aaihVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (aaiw aaiwVar : aaifVar.c) {
            if (aaiwVar.a()) {
                if (aaiwVar.b()) {
                    hashSet4.add(aaiwVar.a);
                } else {
                    hashSet.add(aaiwVar.a);
                }
            } else if (aaiwVar.b()) {
                hashSet5.add(aaiwVar.a);
            } else {
                hashSet2.add(aaiwVar.a);
            }
        }
        if (!aaifVar.g.isEmpty()) {
            hashSet.add(new aajj(aaji.class, aalm.class));
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet);
        this.d = DesugarCollections.unmodifiableSet(hashSet2);
        DesugarCollections.unmodifiableSet(hashSet3);
        this.a = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        Set set = aaifVar.g;
        this.b = aaihVar;
    }

    @Override // defpackage.aaih
    public final aamy a(aajj aajjVar) {
        if (this.d.contains(aajjVar)) {
            return this.b.a(aajjVar);
        }
        throw new aaiy(String.format("Attempting to request an undeclared dependency Provider<%s>.", aajjVar));
    }

    @Override // defpackage.aaih
    public final aamy b(Class cls) {
        return a(new aajj(aaji.class, cls));
    }

    @Override // defpackage.aaih
    public final aamy c(aajj aajjVar) {
        throw null;
    }

    @Override // defpackage.aaih
    public final Object d(aajj aajjVar) {
        if (this.c.contains(aajjVar)) {
            return this.b.d(aajjVar);
        }
        throw new aaiy(String.format("Attempting to request an undeclared dependency %s.", aajjVar));
    }

    @Override // defpackage.aaih
    public final Object e(Class cls) {
        if (!this.c.contains(new aajj(aaji.class, cls))) {
            throw new aaiy(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objE = this.b.e(cls);
        if (!cls.equals(aalm.class)) {
            return objE;
        }
        return new aajk();
    }

    @Override // defpackage.aaih
    public final Set f(aajj aajjVar) {
        throw null;
    }
}
