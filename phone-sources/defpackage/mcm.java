package defpackage;

import android.database.Cursor;
import com.google.android.videos.R;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mcm implements idf {
    private final /* synthetic */ int a;

    public /* synthetic */ mcm(int i) {
        this.a = i;
    }

    @Override // defpackage.idf
    public final Object b(Object obj) {
        switch (this.a) {
            case 0:
                int i = mcn.a;
                return kvk.a;
            case 1:
                Cursor cursor = (Cursor) obj;
                try {
                    byte[] blob = cursor.getBlob(2);
                    vuc vucVarP = vuc.p(xbj.a, blob, 0, blob.length, vtp.a());
                    vuc.B(vucVarP);
                    return (xbj) vucVarP;
                } catch (vuq e) {
                    krd.d("failed to parse pending user sentiment: ".concat(ksy.c(cursor.getInt(0), cursor.getString(1)).toString()), e);
                    return xbj.a;
                }
            case 2:
                kst kstVar = (kst) obj;
                if (!(kstVar instanceof kvf)) {
                    return ieg.a;
                }
                kvf kvfVar = (kvf) kstVar;
                int iC = kvfVar.c() * 1000;
                int iE = kvfVar.e();
                String strE = kvfVar.E();
                Pattern pattern = ksh.a;
                return ieg.f(new mji(iC, null, null, iE, false, strE, "", -1));
            case 3:
                val valVar = (val) obj;
                valVar.getClass();
                return kgu.m(valVar);
            case 4:
                return ieg.b((Throwable) obj);
            case 5:
                return ieg.b((Throwable) obj);
            case 6:
                return "";
            case 7:
                return ((kvj) obj).q;
            case 8:
                return ((mtu) obj).a;
            case 9:
                return ieg.b((Throwable) obj);
            case 10:
                return ieg.f((kwl) obj);
            case 11:
                return ieg.b((Throwable) obj);
            case 12:
                return ieg.f((List) obj);
            case 13:
                return ieg.f(((ksy) obj).b);
            case 14:
                return ieg.f(((ksy) obj).b);
            case 15:
                return ((lsa) obj).a.i().c;
            case 16:
                return Long.valueOf(((mxs) obj).k.dX().hashCode());
            case 17:
                return ((mxs) obj).k.dX();
            case 18:
                return ((muj) obj).c;
            case 19:
                return ((muj) obj).c;
            default:
                return Integer.valueOf(R.layout.details_similarassets_row);
        }
    }
}
