package defpackage;

import android.content.res.Configuration;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements oy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ r(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.oy
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((t) this.a).e.Y();
                break;
            case 1:
                ((t) this.a).e.Y();
                break;
            case 2:
                Configuration configuration = (Configuration) obj;
                am amVar = (am) this.a;
                if (amVar.T()) {
                    amVar.n(configuration, false);
                    break;
                }
                break;
            case 3:
                Integer num = (Integer) obj;
                am amVar2 = (am) this.a;
                if (amVar2.T() && num.intValue() == 80) {
                    amVar2.q(false);
                    break;
                }
                break;
            case 4:
                bbj bbjVar = (bbj) obj;
                am amVar3 = (am) this.a;
                if (amVar3.T()) {
                    amVar3.r(bbjVar.a, false);
                    break;
                }
                break;
            case 5:
                bbj bbjVar2 = (bbj) obj;
                am amVar4 = (am) this.a;
                if (amVar4.T()) {
                    amVar4.w(bbjVar2.a, false);
                    break;
                }
                break;
            case 6:
                super/*android.widget.Button*/.setTypeface((Typeface) obj);
                break;
            case 7:
                super/*android.widget.EditText*/.setTypeface((Typeface) obj);
                break;
            default:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
        }
    }
}
