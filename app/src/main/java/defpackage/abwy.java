package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abwy extends abww implements abxa {
    protected abwy(abwz abwzVar) {
        super(abwzVar);
    }

    private final abwr a() {
        abwr abwrVar = ((abwz) this.b).n;
        if (!abwrVar.c) {
            return abwrVar;
        }
        abwr abwrVarD = abwrVar.clone();
        ((abwz) this.b).n = abwrVarD;
        return abwrVarD;
    }

    private final void g(abxc abxcVar) {
        if (abxcVar.a != this.a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    @Override // defpackage.abww, defpackage.abyq
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final abwz w() {
        abwz abwzVar = (abwz) this.b;
        if ((abwzVar.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            return abwzVar;
        }
        abwzVar.n.f();
        return (abwz) super.w();
    }

    @Override // defpackage.abxa
    public final Object c(abwk abwkVar) {
        throw null;
    }

    public final boolean d(abwk abwkVar) {
        abwz abwzVar = (abwz) this.b;
        abxc abxcVar = (abxc) abwkVar;
        if (abxcVar.a == ((abxd) abwzVar.cM(6, null))) {
            return abwzVar.n.n(abxcVar.d);
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public final void e(abwk abwkVar) {
        Map map = abxd.defaultInstanceMap;
        abxc abxcVar = (abxc) abwkVar;
        g(abxcVar);
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        abwr abwrVarA = a();
        abxb abxbVar = abxcVar.d;
        abzp abzpVar = abwrVarA.b;
        abzpVar.remove(abxbVar);
        if (abzpVar.isEmpty()) {
            abwrVarA.d = false;
        }
    }

    public final void f(abwk abwkVar, Object obj) {
        Map map = abxd.defaultInstanceMap;
        abxc abxcVar = (abxc) abwkVar;
        g(abxcVar);
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        abwr abwrVarA = a();
        abxb abxbVar = abxcVar.d;
        if (!abxbVar.d) {
            obj = abxcVar.d(obj);
        } else if (abxbVar.c.s == acaq.ENUM) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(abxcVar.d(it.next()));
            }
            obj = arrayList;
        }
        abwrVarA.m(abxbVar, obj);
    }

    @Override // defpackage.abww
    public final void y() {
        super.y();
        if (((abwz) this.b).n != abwr.a) {
            abwz abwzVar = (abwz) this.b;
            abwzVar.n = abwzVar.n.clone();
        }
    }
}
