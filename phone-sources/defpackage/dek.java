package defpackage;

import android.support.v7.widget.ActivityChooserView;
import defpackage.dei;
import defpackage.dek;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dek<MessageType extends dek<MessageType, BuilderType>, BuilderType extends dei<MessageType, BuilderType>> extends ddi<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static Map<Object, dek<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected dga unknownFields = dga.a;

    private final int b(dfs dfsVar) {
        return dfsVar == null ? dfp.a.b(this).a(this) : dfsVar.a(this);
    }

    protected static void p(Class cls, dek dekVar) {
        dekVar.o();
        defaultInstanceMap.put(cls, dekVar);
    }

    protected abstract Object a(int i);

    @Override // defpackage.ddi
    public final int c(dfs dfsVar) {
        if (t()) {
            int iB = b(dfsVar);
            if (iB >= 0) {
                return iB;
            }
            throw new IllegalStateException(a.cf(iB, "serialized size must be non-negative, was "));
        }
        if (g() != Integer.MAX_VALUE) {
            return g();
        }
        int iB2 = b(dfsVar);
        q(iB2);
        return iB2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return dfp.a.b(this).f(this, (dek) obj);
        }
        return false;
    }

    final int f() {
        return dfp.a.b(this).b(this);
    }

    final int g() {
        return this.memoizedSerializedSize & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    @Override // defpackage.dfh
    public final int h() {
        return c(null);
    }

    public final int hashCode() {
        if (t()) {
            return f();
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iF = f();
        this.memoizedHashCode = iF;
        return iF;
    }

    public final dei i() {
        return (dei) a(5);
    }

    @Override // defpackage.dfh
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final dei m() {
        return (dei) a(5);
    }

    @Override // defpackage.dfi
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final dek e() {
        return (dek) a(6);
    }

    public final dek l() {
        return (dek) a(4);
    }

    protected final void n() {
        dfp.a.b(this).d(this);
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

    @Override // defpackage.dfh
    public final void r(ddz ddzVar) {
        dfs dfsVarB = dfp.a.b(this);
        cxe cxeVar = ddzVar.f;
        if (cxeVar == null) {
            cxeVar = new cxe(ddzVar);
        }
        dfsVarB.j(this, cxeVar);
    }

    public final boolean s() {
        byte bByteValue = ((Byte) a(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = dfp.a.b(this).g(this);
        a(2);
        return zG;
    }

    final boolean t() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final String toString() throws SecurityException {
        String string = super.toString();
        int i = dfj.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        dfj.b(this, sb, 0);
        return sb.toString();
    }
}
