package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjz extends hjx {
    public hjz(Class cls, Class cls2) {
        super("Failed to find any ModelLoaders for model: " + cls.toString() + " and data: " + cls2.toString());
    }

    public hjz(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public hjz(Object obj, List list) {
        super(a.cA(obj, list, "Found ModelLoaders for model class: ", ", but none that handle this specific model instance: "));
    }
}
