package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxk extends fxl {
    private final Class a;

    public fxk(Class cls) {
        super(cls);
        if (cls.isEnum()) {
            this.a = cls;
        } else {
            Objects.toString(cls);
            throw new IllegalArgumentException(cls.toString().concat(" is not an Enum type."));
        }
    }

    @Override // defpackage.fxl, defpackage.fxm
    public final String c() {
        String name = this.a.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.fxl, defpackage.fxm
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Enum b(String str) {
        Object obj;
        Class cls = this.a;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int i = 0;
        while (true) {
            if (i >= enumConstants.length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (ylh.y(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r3 = (Enum) obj;
        if (r3 != null) {
            return r3;
        }
        throw new IllegalArgumentException("Enum value " + str + " not found for type " + cls.getName() + '.');
    }
}
