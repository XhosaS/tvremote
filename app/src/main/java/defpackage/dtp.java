package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dtp extends dtu implements dui, dtq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtp() {
        super(null, -1048037474, null);
        Map map = drq.g;
        this.b = this;
    }

    public abstract void b(ComponentTree componentTree, Exception exc);

    @Override // defpackage.dtu
    public final /* synthetic */ void cC(Object obj) {
        x(this, (dto) obj);
    }

    @Override // defpackage.dtq
    public final Object x(dtu dtuVar, Object obj) {
        int i = dtuVar.c;
        Map map = drq.g;
        if (i != -1048037474) {
            return null;
        }
        dto dtoVar = (dto) obj;
        Exception exc = dtoVar.b;
        ComponentTree componentTree = dtoVar.a;
        componentTree.getClass();
        b(componentTree, exc);
        return null;
    }

    @Override // defpackage.dui
    public final dtq n() {
        return this;
    }
}
