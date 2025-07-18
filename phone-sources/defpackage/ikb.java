package defpackage;

import android.support.v7.appcompat.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ikb implements yjv {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ikb(long j, Object obj, int i) {
        this.c = i;
        this.a = j;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [bdy, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        ghi ghiVarA;
        switch (this.c) {
            case 0:
                ghiVarA = ((gic) obj).a("\n      SELECT Item.media_library_item_id from `media_library_item` Item LEFT JOIN `media_library_item_metadata` Metadata  ON Item.account_name = Metadata.account_name AND Item.play_id = Metadata.play_id WHERE IFNULL(Metadata.expiration_time_millis, 0) < ? AND Item.account_name = ?\n    ");
                Object obj2 = this.b;
                try {
                    ghiVarA.g(1, this.a);
                    ghiVarA.i(2, (String) obj2);
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA.l()) {
                        wmp wmpVarX = ipc.x(ghiVarA.k(0) ? null : ghiVarA.m(0));
                        if (wmpVarX == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.MediaLibraryItemId', but it was NULL.");
                        }
                        arrayList.add(wmpVarX);
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                bpq bpqVar = (bpq) obj;
                ?? r12 = this.b;
                long j = this.a;
                long j2 = atc.a;
                brx.o(bpqVar, j, 0L, 0L, ykn.i(((Number) r12.a()).floatValue(), 0.0f, 1.0f), null, R.styleable.AppCompatTheme_windowActionBarOverlay);
                return ygi.a;
            case 2:
                long j3 = ikt.a;
                ghiVarA = ((gic) obj).a("DELETE FROM search_history WHERE account_name = ? AND last_write_mills < ?");
                long j4 = this.a;
                try {
                    ghiVarA.i(1, (String) this.b);
                    ghiVarA.g(2, j4);
                    ghiVarA.l();
                    return ygi.a;
                } finally {
                }
            case 3:
                ((oxn) this.b).b(this.a, false);
                return ygi.a;
            case 4:
                ghiVarA = ((gic) obj).a("SELECT COUNT(*) FROM preview_programs WHERE channel_id = ? AND package_name= ?");
                try {
                    ghiVarA.g(1, this.a);
                    Object obj3 = this.b;
                    if (obj3 == null) {
                        ghiVarA.h(2);
                    } else {
                        ghiVarA.i(2, (String) obj3);
                    }
                    return Long.valueOf(ghiVarA.l() ? ghiVarA.b(0) : 0L);
                } finally {
                }
            case 5:
                gic gicVar = (gic) obj;
                ghiVarA = gicVar.a("DELETE FROM preview_programs WHERE _id= ? AND package_name = ?");
                Object obj4 = this.b;
                try {
                    ghiVarA.g(1, this.a);
                    ghiVarA.i(2, (String) obj4);
                    ghiVarA.l();
                    return Integer.valueOf(gez.K(gicVar));
                } finally {
                }
            case 6:
                gic gicVar2 = (gic) obj;
                ghiVarA = gicVar2.a("DELETE FROM watch_next_programs WHERE _id= ? AND package_name= ?");
                Object obj5 = this.b;
                try {
                    ghiVarA.g(1, this.a);
                    ghiVarA.i(2, (String) obj5);
                    ghiVarA.l();
                    return Integer.valueOf(gez.K(gicVar2));
                } finally {
                }
            case 7:
                gic gicVar3 = (gic) obj;
                ghiVarA = gicVar3.a("DELETE FROM preview_programs WHERE channel_id = ? AND package_name= ?");
                Object obj6 = this.b;
                try {
                    ghiVarA.g(1, this.a);
                    ghiVarA.i(2, (String) obj6);
                    ghiVarA.l();
                    return Integer.valueOf(gez.K(gicVar3));
                } finally {
                }
            default:
                gic gicVar4 = (gic) obj;
                ghiVarA = gicVar4.a("DELETE FROM channels WHERE _id = ? AND package_name = ?");
                Object obj7 = this.b;
                try {
                    ghiVarA.g(1, this.a);
                    ghiVarA.i(2, (String) obj7);
                    ghiVarA.l();
                    return Integer.valueOf(gez.K(gicVar4));
                } finally {
                }
        }
    }

    public /* synthetic */ ikb(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }
}
