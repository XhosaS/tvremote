package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mll {
    public static final String a = "mll";
    public static final AtomicInteger b = new AtomicInteger(1);

    public static void a(RecyclerView recyclerView, oaa oaaVar, CommandOuterClass$Command commandOuterClass$Command, nzw nzwVar, ocj ocjVar, obz obzVar) {
        nzv nzvVarP = nzx.p();
        nzvVarP.f(recyclerView);
        nyu nyuVar = (nyu) nzvVarP;
        nyuVar.e = ocjVar;
        nyuVar.d = obzVar;
        nzwVar.a(nzvVarP);
        oaaVar.a(commandOuterClass$Command, nzvVarP.e()).k();
    }

    public static int b(int i) {
        return i + (-1) != 1 ? 1 : 0;
    }

    static int c(int i, int i2, boolean z, oco ocoVar, oal oalVar) {
        int i3 = Integer.MIN_VALUE;
        if (!z && i != 3 && i != 1) {
            ocoVar.b(acsw.LOG_TYPE_CONFIGURATION_ERROR, oalVar, "Only snap to start is implemented for vertical lists", new Object[0]);
            return Integer.MIN_VALUE;
        }
        int i4 = -1;
        int i5 = i2 - 1;
        int i6 = i - 1;
        int i7 = Integer.MAX_VALUE;
        if (i5 == 1) {
            i3 = 2147483643;
        } else if (i5 == 2) {
            i4 = 2147483644;
            i7 = 2147483646;
        }
        return i6 != 1 ? i6 != 2 ? i3 : i4 : i7;
    }
}
