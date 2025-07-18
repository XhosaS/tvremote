package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class znc extends zix implements zig {
    zjh a;

    public znc(Date date) throws NumberFormatException {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", zli.a);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String strConcat = String.valueOf(simpleDateFormat.format(date)).concat("Z");
        int i = Integer.parseInt(strConcat.substring(0, 4));
        if (i < 1950 || i > 2049) {
            this.a = new zkl(strConcat);
        } else {
            this.a = new zjt(strConcat.substring(2));
        }
    }

    public static znc c(Object obj) {
        if (obj == null || (obj instanceof znc)) {
            return (znc) obj;
        }
        if (obj instanceof zjt) {
            return new znc((zjt) obj);
        }
        if (obj instanceof zio) {
            return new znc((zio) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public final String a() {
        zjh zjhVar = this.a;
        return zjhVar instanceof zjt ? ((zjt) zjhVar).b() : ((zio) zjhVar).b();
    }

    public final Date b() {
        try {
            zjh zjhVar = this.a;
            if (!(zjhVar instanceof zjt)) {
                return ((zio) zjhVar).f();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz", zli.a);
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
            return simpleDateFormat.parse(((zjt) zjhVar).b());
        } catch (ParseException e) {
            throw new IllegalStateException("invalid date string: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        return this.a;
    }

    public final String toString() {
        return a();
    }

    public znc(zjh zjhVar) {
        if (!(zjhVar instanceof zjt) && !(zjhVar instanceof zio)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.a = zjhVar;
    }
}
