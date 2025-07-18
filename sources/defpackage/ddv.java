package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddv extends czr implements cza {
    dab a;

    public ddv(Date date) throws NumberFormatException {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", dcc.a);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String strConcat = String.valueOf(simpleDateFormat.format(date)).concat("Z");
        int i = Integer.parseInt(strConcat.substring(0, 4));
        if (i < 1950 || i > 2049) {
            this.a = new dbf(strConcat);
        } else {
            this.a = new dan(strConcat.substring(2));
        }
    }

    public static ddv c(Object obj) {
        if (obj == null || (obj instanceof ddv)) {
            return (ddv) obj;
        }
        if (obj instanceof dan) {
            return new ddv((dan) obj);
        }
        if (obj instanceof czi) {
            return new ddv((czi) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public final String a() {
        dab dabVar = this.a;
        return dabVar instanceof dan ? ((dan) dabVar).b() : ((czi) dabVar).b();
    }

    public final Date b() {
        try {
            dab dabVar = this.a;
            if (!(dabVar instanceof dan)) {
                return ((czi) dabVar).f();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz", dcc.a);
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
            return simpleDateFormat.parse(((dan) dabVar).b());
        } catch (ParseException e) {
            throw new IllegalStateException("invalid date string: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        return this.a;
    }

    public final String toString() {
        return a();
    }

    public ddv(dab dabVar) {
        if (!(dabVar instanceof dan) && !(dabVar instanceof czi)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.a = dabVar;
    }
}
