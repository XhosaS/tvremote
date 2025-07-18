package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzl {
    public Uri a;
    public ImmutableList b;
    public eab c;
    public dzr d;
    public dzu e;
    private String f;
    private String g;
    private final dzm h;
    private dzp i;
    private List j;
    private String k;
    private dzk l;
    private long m;

    public dzl() {
        this.h = new dzm();
        this.i = new dzp();
        this.j = Collections.EMPTY_LIST;
        this.b = ImmutableList.of();
        this.d = new dzr();
        this.e = dzu.a;
        this.m = -9223372036854775807L;
    }

    public final dzy a() {
        dzt dztVar;
        dzp dzpVar = this.i;
        boolean z = true;
        if (dzpVar.b != null && dzpVar.a == null) {
            z = false;
        }
        a.ab(z);
        Uri uri = this.a;
        if (uri != null) {
            String str = this.g;
            dzp dzpVar2 = this.i;
            dztVar = new dzt(uri, str, dzpVar2.a != null ? new dzq(dzpVar2) : null, this.l, this.j, this.k, this.b, this.m);
        } else {
            dztVar = null;
        }
        String str2 = this.f;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        dzo dzoVar = new dzo(this.h);
        dzs dzsVar = new dzs(this.d);
        eab eabVar = this.c;
        if (eabVar == null) {
            eabVar = eab.a;
        }
        return new dzy(str3, dzoVar, dztVar, dzsVar, eabVar, this.e);
    }

    public final void b(String str) {
        str.getClass();
        this.f = str;
    }

    public final void c() {
        this.g = "application/dash+xml";
    }

    public final void d(String str) {
        this.a = str == null ? null : Uri.parse(str);
    }

    public dzl(dzy dzyVar) {
        this();
        this.h = new dzm(dzyVar.f);
        this.f = dzyVar.b;
        this.c = dzyVar.e;
        this.d = new dzr(dzyVar.d);
        this.e = dzyVar.g;
        dzt dztVar = dzyVar.c;
        if (dztVar != null) {
            this.k = dztVar.n;
            this.g = dztVar.j;
            this.a = dztVar.i;
            this.j = dztVar.m;
            this.b = dztVar.o;
            dzq dzqVar = dztVar.k;
            this.i = dzqVar != null ? new dzp(dzqVar) : new dzp();
            this.l = dztVar.l;
            this.m = dztVar.q;
        }
    }
}
