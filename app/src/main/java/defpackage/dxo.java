package defpackage;

import android.util.SparseIntArray;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxo implements Cloneable {
    public final drq a;
    public final dru b;
    public final dxx c;
    public final dxe d;
    public SparseIntArray e;
    public final dtu f;
    public List g;
    public Map mManualKeysCounter;

    public dxo(drq drqVar, dru druVar, dtu dtuVar) {
        this.a = drqVar;
        this.b = druVar;
        this.c = drqVar.u();
        this.d = drqVar.t();
        this.f = dtuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dxo clone() {
        try {
            return (dxo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
