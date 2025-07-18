package defpackage;

import android.support.v7.widget.ActivityChooserView;
import defpackage.dpc;
import defpackage.dpf;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dpf<MessageType extends dpf<MessageType, BuilderType>, BuilderType extends dpc<MessageType, BuilderType>> extends doa<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static Map<Object, dpf<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected dqu unknownFields = dqu.a;

    public static dpj l(dpj dpjVar) {
        int size = dpjVar.size();
        return dpjVar.d(size == 0 ? 10 : size + size);
    }

    protected static void p(Class cls, dpf dpfVar) {
        dpfVar.o();
        defaultInstanceMap.put(cls, dpfVar);
    }

    private final int u(dqk dqkVar) {
        return dqkVar == null ? dqh.a.b(this).a(this) : dqkVar.a(this);
    }

    public abstract Object a(int i);

    @Override // defpackage.doa
    public final int b(dqk dqkVar) {
        if (t()) {
            int iU = u(dqkVar);
            if (iU >= 0) {
                return iU;
            }
            throw new IllegalStateException(a.cf(iU, "serialized size must be non-negative, was "));
        }
        if (f() != Integer.MAX_VALUE) {
            return f();
        }
        int iU2 = u(dqkVar);
        q(iU2);
        return iU2;
    }

    final int d() {
        return dqh.a.b(this).b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return dqh.a.b(this).f(this, (dpf) obj);
        }
        return false;
    }

    final int f() {
        return this.memoizedSerializedSize & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    @Override // defpackage.dqa
    public final int g() {
        return b(null);
    }

    public final dpc h() {
        return (dpc) a(5);
    }

    public final int hashCode() {
        if (t()) {
            return d();
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iD = d();
        this.memoizedHashCode = iD;
        return iD;
    }

    @Override // defpackage.dqa
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final dpc m() {
        return (dpc) a(5);
    }

    @Override // defpackage.dqb
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final dpf e() {
        return (dpf) a(6);
    }

    public final dpf k() {
        return (dpf) a(4);
    }

    protected final void n() {
        dqh.a.b(this).d(this);
        o();
    }

    final void o() {
        this.memoizedSerializedSize &= ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    final void q(int i) {
        if (i < 0) {
            throw new IllegalStateException(a.cf(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = i | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    @Override // defpackage.dqa
    public final void r(dot dotVar) {
        dqk dqkVarB = dqh.a.b(this);
        dhq dhqVar = dotVar.f;
        if (dhqVar == null) {
            dhqVar = new dhq(dotVar);
        }
        dqkVarB.i(this, dhqVar);
    }

    public final boolean s() {
        byte bByteValue = ((Byte) a(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = dqh.a.b(this).g(this);
        a(2);
        return zG;
    }

    final boolean t() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final String toString() throws SecurityException {
        String string = super.toString();
        int i = dqc.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        dqc.b(this, sb, 0);
        return sb.toString();
    }
}
