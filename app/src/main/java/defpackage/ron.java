package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ron implements roj {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b;
    private static final Pattern c;
    private final ujk d;

    static {
        Pattern patternD = d("NID=");
        b = patternD;
        Pattern patternD2 = d("__Secure-ENID=");
        c = patternD2;
        yyr.l("NID=", patternD, "__Secure-ENID=", patternD2);
    }

    public ron(ujk ujkVar) {
        this.d = ujkVar;
        Optional.empty();
    }

    public static Optional c(roq roqVar) {
        wvx wvxVarF = wzg.f("ZwiebackCookieProviderImpl#extractZwieback", wwb.a, true);
        try {
            String str = roqVar.b;
            Optional optionalOf = !str.isEmpty() ? Optional.of(str) : Optional.empty();
            wvxVarF.close();
            return optionalOf;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static Pattern d(String str) {
        return Pattern.compile(String.format("^(?i:Set-Cookie):\\s*%s([^\r\n;]*)", str), 8);
    }

    @Override // defpackage.roj
    public final zyd a() {
        wvx wvxVarF = wzg.f("ZwiebackCookieProviderImpl#getCookie", wwb.a, true);
        try {
            zyd zydVarC = this.d.c();
            yqi yqiVar = new yqi() { // from class: rok
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    roq roqVar = (roq) obj;
                    int i = ron.a;
                    final String str = roqVar.c;
                    if (true == str.isEmpty()) {
                        str = "NID";
                    }
                    return ron.c(roqVar).map(new Function() { // from class: rol
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo116andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            int i2 = ron.a;
                            return str + "=" + ((String) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
            };
            zyd zydVarG = zuz.g(zydVarC, wyo.a(yqiVar), zwk.a);
            wvxVarF.close();
            return zydVarG;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.roj
    public final zyd b() {
        wvx wvxVarF = wzg.f("ZwiebackCookieProviderImpl#getZwieback", wwb.a, true);
        try {
            zyd zydVarC = this.d.c();
            yqi yqiVar = new yqi() { // from class: rom
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return ron.c((roq) obj);
                }
            };
            zyd zydVarG = zuz.g(zydVarC, wyo.a(yqiVar), zwk.a);
            wvxVarF.close();
            return zydVarG;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
