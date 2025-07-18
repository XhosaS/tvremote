package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yjc implements Serializable {
    private static final long serialVersionUID = 0;
    private final Class a;

    public yjc(Enum[] enumArr) {
        Class<?> componentType = enumArr.getClass().getComponentType();
        componentType.getClass();
        this.a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.a.getEnumConstants();
        enumConstants.getClass();
        return wcq.P((Enum[]) enumConstants);
    }
}
