package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fxl extends fxm {
    private final Class a;

    public fxl(Class cls) {
        if (Serializable.class.isAssignableFrom(cls)) {
            this.a = cls;
        } else {
            Objects.toString(cls);
            throw new IllegalArgumentException(cls.toString().concat(" does not implement Serializable."));
        }
    }

    @Override // defpackage.fxm
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Serializable b(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    @Override // defpackage.fxm
    public String c() {
        String name = this.a.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.fxm
    public final /* bridge */ /* synthetic */ void d(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        serializable.getClass();
        this.a.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fxl) {
            return yks.e(this.a, ((fxl) obj).a);
        }
        return false;
    }

    @Override // defpackage.fxm
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str) {
        str.getClass();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
