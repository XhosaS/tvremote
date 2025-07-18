package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afzq {
    private afzq() {
    }

    public static Set a(Map map, String str) {
        Status.Code code;
        List listF = afsx.f(map, str);
        if (listF == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(Status.Code.class);
        for (Object obj : listF) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                yry.a(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                code = Status.fromCodeValue(iIntValue).getCode();
                yry.a(code.value() == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new yrz("Can not convert status code " + String.valueOf(obj) + " to Status.Code, because its type is " + String.valueOf(obj.getClass()));
                }
                try {
                    Status.Code code2 = Status.Code.OK;
                    code = (Status.Code) Enum.valueOf(Status.Code.class, (String) obj);
                } catch (IllegalArgumentException e) {
                    throw new yrz(a.o(obj, "Status code ", " is not valid"), e);
                }
            }
            enumSetNoneOf.add(code);
        }
        return DesugarCollections.unmodifiableSet(enumSetNoneOf);
    }
}
