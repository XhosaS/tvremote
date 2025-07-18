package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.PlaySearchActionButton;
import com.google.android.play.search.PlaySearchNavigationButton;
import com.google.android.play.search.PlaySearchPlateTextContainer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tbx implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public tbx(View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                EditText editText = ((tca) obj).a;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    ((tco) obj).x();
                    break;
                }
                break;
            case 1:
                ((sys) this.a).e();
                break;
            case 2:
                ((tck) this.a).m();
                break;
            case 3:
                Object obj2 = this.a;
                tcu tcuVar = (tcu) obj2;
                EditText editText2 = tcuVar.a;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    if (tcuVar.k()) {
                        tcuVar.a.setTransformationMethod(null);
                    } else {
                        tcuVar.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        tcuVar.a.setSelection(selectionEnd);
                    }
                    ((tco) obj2).x();
                    break;
                }
                break;
            case 4:
                ((PlaySearch) this.a).i();
                break;
            case 5:
                PlaySearchActionButton playSearchActionButton = (PlaySearchActionButton) this.a;
                tgw tgwVar = playSearchActionButton.a;
                if (tgwVar != null) {
                    int i = playSearchActionButton.b;
                    if (i != 1) {
                        if (i == 2) {
                            tgwVar.e(4);
                            break;
                        }
                    } else {
                        tgwVar.f("");
                        break;
                    }
                }
                break;
            case 6:
                PlaySearchNavigationButton playSearchNavigationButton = (PlaySearchNavigationButton) this.a;
                tgw tgwVar2 = playSearchNavigationButton.a;
                if (tgwVar2 != null) {
                    View.OnClickListener onClickListener = tgwVar2.e;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    if (playSearchNavigationButton.b == 1) {
                        playSearchNavigationButton.a.h();
                        break;
                    }
                }
                break;
            case 7:
                tgw tgwVar3 = ((PlaySearchPlateTextContainer) this.a).a;
                if (tgwVar3 != null) {
                    tgwVar3.e(3);
                    break;
                }
                break;
            case 8:
                Object obj3 = this.a;
                ((tof) obj3).c.d();
                ((bl) obj3).requireDialog().cancel();
                break;
            case 9:
                tof tofVar = (tof) this.a;
                tofVar.e = true;
                tofVar.a.setEnabled(false);
                Iterator it = tofVar.b.iterator();
                while (it.hasNext()) {
                    ((EditText) it.next()).setEnabled(false);
                }
                toe toeVar = tofVar.c;
                StringBuilder sb = new StringBuilder();
                Iterator it2 = tofVar.b.iterator();
                while (it2.hasNext()) {
                    sb.append((CharSequence) ((EditText) it2.next()).getText());
                }
                toeVar.g(sb.toString());
                break;
            default:
                tok tokVar = (tok) this.a;
                tokVar.c.requestFocus();
                tokVar.e.showSoftInput(tokVar.c, 2);
                break;
        }
    }

    public /* synthetic */ tbx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
