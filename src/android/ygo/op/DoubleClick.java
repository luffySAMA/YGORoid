package android.ygo.op;

import android.ygo.core.Duel;
import android.ygo.core.Item;
import android.ygo.core.SelectableItem;

public class DoubleClick implements Operation {
    int x;
    int y;

    Duel duel;
    SelectableItem item;
    Item container;

    public DoubleClick(Duel duel, float fx, float fy) {
        x = (int) fx;
        y = (int) fy;
        this.duel = duel;
        item = duel.itemAt(x, y);
        container = duel.containerAt(x, y);
    }

    @Override
    public Duel getDuel() {
        return duel;
    }

    @Override
    public SelectableItem getItem() {
        return item;
    }

    @Override
    public Item getContainer() {
        return container;
    }

    @Override
    public int x() {
        return x;
    }

    @Override
    public int y() {
        return y;
    }
}
