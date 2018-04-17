package com.op.opcore.item;

import java.util.List;

import com.op.opcore.bases.BaseAlloy;
import net.minecraft.client.gui.Gui;
import scala.tools.nsc.doc.base.comment.Text;

/**
 * 合金研究指导
 */
public class AlloyResearchGuide extends Gui {

    //    当前页数，格子
    private Integer page;
    private static BaseAlloy[][] grid = new BaseAlloy[5][5];
    //    当前页内容标题，页脚
    private String tittle;
    private String context;

    private List<BaseAlloy> alloies;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Text getContext() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0) {
                    grid[i][j] = alloies.get(i * j + j);
                } else {
                    grid[i][j] = alloies.get(i * j);
                }
            }
            page++;
        }
        return Text.apply(grid.toString());
    }

}
