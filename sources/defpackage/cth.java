package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cth implements Serializable {
    private static final long serialVersionUID = 0;
    private final Class a;

    public cth(Enum[] enumArr) {
        Class<?> componentType = enumArr.getClass().getComponentType();
        componentType.getClass();
        this.a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.a.getEnumConstants();
        enumConstants.getClass();
        return dnx.aD((Enum[]) enumConstants);
    }
}
