package androidx.compose.ui.input.pointer;

import defpackage.bko;
import defpackage.bts;
import defpackage.bzi;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends bzi<bts> {
    private final Object a;
    private final Object b;
    private final Object[] c;
    private final PointerInputEventHandler d;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        this.a = 1 == (i & 1) ? null : obj;
        this.b = (i & 2) != 0 ? null : obj2;
        this.c = null;
        this.d = pointerInputEventHandler;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new bts(this.a, this.b, this.d);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        bts btsVar = (bts) bkoVar;
        Object obj = btsVar.a;
        Object obj2 = this.a;
        boolean z = !yks.e(obj, obj2);
        btsVar.a = obj2;
        Object obj3 = btsVar.b;
        Object obj4 = this.b;
        boolean z2 = !yks.e(obj3, obj4);
        btsVar.b = obj4;
        Class<?> cls = btsVar.c.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls != pointerInputEventHandler.getClass() || (z | z2)) {
            btsVar.q();
        }
        btsVar.c = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!yks.e(this.a, suspendPointerInputElement.a) || !yks.e(this.b, suspendPointerInputElement.b)) {
            return false;
        }
        Object[] objArr = suspendPointerInputElement.c;
        return this.d == suspendPointerInputElement.d;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        return (((iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 961) + this.d.hashCode();
    }
}
