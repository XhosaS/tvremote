package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mii {
    public final int a;
    public final mim b;
    private final Class c;

    public mii(int i, Class cls, mim mimVar) {
        this.a = i;
        this.c = cls;
        this.b = mimVar;
    }

    public abstract long a();

    public final mil b(mil milVar) {
        return (mil) this.c.cast(milVar);
    }

    public abstract mil c(UpbMessage upbMessage);

    public abstract UpbMiniTable d();
}
