package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abau extends abar {
    public final abbq a = new abbq(abbq.a, false);

    public final abaq d(String str) {
        return (abaq) this.a.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof abau) && ((abau) obj).a.equals(this.a);
        }
        return true;
    }

    public final abar g(String str) {
        return (abar) this.a.get(str);
    }

    @Override // defpackage.abar
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final abau b() {
        abau abauVar = new abau();
        abbk abbkVar = new abbk((abbl) this.a.entrySet());
        while (abbkVar.hasNext()) {
            abbp abbpVarA = abbkVar.a();
            abauVar.k((String) abbpVarA.f, ((abar) abbpVarA.h).b());
        }
        return abauVar;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final abau i(String str) {
        return (abau) this.a.get(str);
    }

    public final abax j(String str) {
        return (abax) this.a.get(str);
    }

    public final void k(String str, abar abarVar) {
        if (abarVar == null) {
            abarVar = abat.a;
        }
        this.a.put(str, abarVar);
    }

    public final void l(String str, String str2) {
        k(str, str2 == null ? abat.a : new abax(str2));
    }
}
